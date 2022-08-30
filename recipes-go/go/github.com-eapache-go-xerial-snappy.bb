DESCRIPTION = "github.com/eapache/go-xerial-snappy"

GO_IMPORT = "github.com/eapache/go-xerial-snappy"

inherit go

SRC_URI = "git://github.com/eapache/go-xerial-snappy;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "bb955e01b9346ac19dc29eb16586c90ded99a98c" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=dcb7929be2a0ff22ad39f869509911d7"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    github.com-golang-snappy \
"