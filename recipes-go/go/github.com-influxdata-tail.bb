DESCRIPTION = "github.com/influxdata/tail"

GO_IMPORT = "github.com/influxdata/tail"

inherit go

SRC_URI = "git://github.com/influxdata/tail;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "e9ef7e826dafcb3093b40b989fefa90eeb9a8ca1" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=0bdce43b16cd5c587124d6f274632c87"

FILES:${PN} += "${GOBIN_FINAL}/*"
