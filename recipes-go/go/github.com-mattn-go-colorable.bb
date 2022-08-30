DESCRIPTION = "github.com/mattn/go-colorable"

GO_IMPORT = "github.com/mattn/go-colorable"

inherit go

SRC_URI = "git://github.com/mattn/go-colorable;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "ded68f7a9561c023e790de24279db7ebf473ea80" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=24ce168f90aec2456a73de1839037245"

FILES:${PN} += "${GOBIN_FINAL}/*"
