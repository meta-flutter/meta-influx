DESCRIPTION = "github.com/kardianos/service"

GO_IMPORT = "github.com/kardianos/service"

inherit go

SRC_URI = "git://github.com/kardianos/service;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6d3a0ee7d3425d9d835debc51a0ca1ffa28f4893" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b5f729083058adfe7476d146a6218ffc"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-kardianos-osext \
"