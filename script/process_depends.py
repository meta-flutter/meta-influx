import os
import sys
import argparse
import shutil
from subprocess import call, Popen, PIPE


def createDir(dir):
    if not os.path.exists(dir):
        os.makedirs(dir)
    return dir
    

def processLines(file):
    with open(file) as f:
        content = f.readlines()
        outdir=createDir('output')
    
    template=""
    with open('template') as f:
        template=f.read()
        f.close()
        
        
    for line in content: 
        gitdir=createDir(os.path.realpath(".")+"/git")
        
        line_parts=line.split(' ')
        repo=line_parts[0]
        commit=line_parts[1].replace('\n','')
        
        print(repo + " " + commit)
        
        bbfilename=repo.replace("/",'-').lower()
        bbfilename+=".bb"
        print("\t\t\t"+bbfilename)
        
        repo_url=repo
        isRightURL=""
        while(isRightURL==""):
            isRightURL=input("Is this the right repository url: "+repo_url+"[Yn]")
            
            if(isRightURL=="y" or isRightURL==""):    
                call(["git","clone","https://"+repo_url,gitdir])
                p=Popen(["git","rev-parse","HEAD"],cwd=gitdir,stdin=PIPE, stdout=PIPE, stderr=PIPE)
                output, err = p.communicate()
                head=output.decode("utf-8").replace("\n","")
                
                
                files=dict(enumerate(os.listdir(gitdir)))
                for file in files:
                    print(file, files[file])
                    
                
                file_no=input("Select license file: ")
                #TODO error handling
                license_file=files[int(file_no)]
                
                p=Popen(["md5sum",gitdir+"/"+license_file],cwd=gitdir,stdin=PIPE, stdout=PIPE, stderr=PIPE)
                output, err = p.communicate()
                md5sum=output.decode("utf-8").replace("\n","").split(' ')[0]
                
                print(md5sum)
            
            
                print("\n\n\n\n#######LICENSE######")
                call(["firefox","https://"+repo_url])
                    
                with open(gitdir+'/'+license_file) as f:
                    i=0
                    for line in f:
                        print(line)
                        i+=1
                        if(i==30): break
                    f.close()
                    
                lic_string=input("input license abbrev:[DWTFYW]")
                if(lic_string==""): lic_string="DWTFYW"
                
                
                
                recipe_text=template
                with open(outdir+"/"+bbfilename, "w") as f:
                    recipe_text=recipe_text.replace('###REPO###',repo)
                    recipe_text=recipe_text.replace('###COMMIT###',commit)
                    recipe_text=recipe_text.replace('###LIC###',lic_string)
                    recipe_text=recipe_text.replace('###LICFILE###',license_file)
                    recipe_text=recipe_text.replace('###LICMD5###',md5sum)
                    
                    f.write(recipe_text)
                    f.close()
                    pass
                    
                
                
            elif(isRightURL=="n"):
                repo_url=input("Enter url: ")
                isRightURL=""
                
                pass
            else:
                isRightURL=""
                print("Wrong Entry!")
                pass
            
        
        shutil.rmtree(gitdir)

        
        

def main():



    # get the args passed to blender after "--", all of which are ignored by
    # blender so scripts may receive their own arguments
    argv = sys.argv

    parser = argparse.ArgumentParser()
    parser.add_argument("infile", help="dependency list")
    args = parser.parse_args()
    
    processLines(args.infile)

main()