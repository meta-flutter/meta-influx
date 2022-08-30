DESCRIPTION = "github.com/siddontang/rdb"

GO_IMPORT = "github.com/siddontang/rdb"

inherit go

SRC_URI = "git://github.com/siddontang/rdb;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "fc89ed2e418d27e3ea76e708e54276d2b44ae9cf" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=72b166a754268111d07727b0e801dfd4"

FILES:${PN} += "${GOBIN_FINAL}/*"


DEPENDS+="\
    github.com-cupcake-rdb \
    "