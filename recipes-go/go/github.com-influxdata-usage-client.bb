DESCRIPTION = "github.com/influxdata/usage-client"

GO_IMPORT = "github.com/influxdata/usage-client"

inherit go

SRC_URI = "git://github.com/influxdata/usage-client;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6d3895376368aa52a3a81d2a16e90f0f52371967"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=17cff8e5ad17d1d8c2ac21440e86d366"

FILES_${PN} += "${GOBIN_FINAL}/*"
