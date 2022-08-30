DESCRIPTION = "github.com/influxdata/toml"

GO_IMPORT = "github.com/influxdata/toml"

inherit go

SRC_URI = "git://github.com/influxdata/toml;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5d1d907f22ead1cd47adde17ceec5bda9cacaf8f" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=9191b4cb03404322c952b5e2a69c0914"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
          github.com-naoina-go-stringutil \
"