DESCRIPTION = "github.com/rakyll/statik"

inherit go

SRC_URI = "git://github.com/rakyll/statik;protocol=https"
SRCREV = "e383bbf6b2ec1a2fb8492dfd152d945fb88919b6"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a873c5645c184d51e0f9b34e1d7cf559"

S = "${WORKDIR}/git"

inherit go


do_compile(){
    go build statik.go
}

do_install(){
    install -d "${D}/${bindir}"
    install -m 0755 "${S}/statik" "${D}/${bindir}"
}
