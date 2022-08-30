DESCRIPTION = "github.com/wvanbergen/kazoo-go"

GO_IMPORT = "github.com/wvanbergen/kazoo-go"

inherit go

SRC_URI = "git://github.com/wvanbergen/kazoo-go;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "968957352185472eacb69215fa3dbfcfdbac1096" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/MIT-LICENSE;md5=ef7fb95d1145e240912ea0db10a5ca9d"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-samuel-go-zookeeper \
"