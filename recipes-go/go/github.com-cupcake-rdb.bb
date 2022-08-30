DESCRIPTION = "github.com/cupcake/rdb"

GO_IMPORT = "github.com/cupcake/rdb"

inherit go

SRC_URI = "git://github.com/cupcake/rdb;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "43ba34106c765f2111c0dc7b74cdf8ee437411e0" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENCE;md5=1ff1c99d77e85b1aa6addd82b32a0cfa"

FILES:${PN} += "${GOBIN_FINAL}/*"
