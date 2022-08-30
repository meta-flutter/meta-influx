DESCRIPTION = "github.com/gobwas/glob"

GO_IMPORT = "github.com/gobwas/glob"

inherit go

SRC_URI = "git://github.com/gobwas/glob;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "bea32b9cd2d6f55753d94a28e959b13f0244797a" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0945febef83436030e30c73ea9980b42"

FILES:${PN} += "${GOBIN_FINAL}/*"

RDEPENDS:${PN}-staticdev += "\
                             bash \
                            "