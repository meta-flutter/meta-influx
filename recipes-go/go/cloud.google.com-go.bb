DESCRIPTION = "Packages used to access Google Cloud Services"
SECTION = "net"
HOMEPAGE = "http://cloud.google.com/go"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "golang.org-x-text"

GO_IMPORT = "cloud.google.com/go"
GO_INSTALL = "\
	cloud.google.com/go/compute/metadata \
	cloud.google.com/go/internal \
"

inherit go

SRC_URI = "git://code.googlesource.com/gocloud;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"

SRCREV = "1ec09e65be459e9a0c9014ff8e4591d8c2f1bed6"

DEPENDS+="\
    github.com-googleapis-gax-go \
"

RDEPENDS_${PN}-staticdev += "bash"