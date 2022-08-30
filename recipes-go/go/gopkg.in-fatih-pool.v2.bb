DESCRIPTION = "gopkg.in/fatih/pool.v2"

GO_IMPORT = "gopkg.in/fatih/pool.v2"

inherit go

SRC_URI = "git://gopkg.in/fatih/pool.v2;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6e328e67893eb46323ad06f0e92cb9536babbabc" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=316e6d590bdcde7993fb175662c0dd5a"

FILES:${PN} += "${GOBIN_FINAL}/*"
