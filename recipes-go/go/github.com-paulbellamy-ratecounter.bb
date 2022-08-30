DESCRIPTION = "github.com/paulbellamy/ratecounter"

GO_IMPORT = "github.com/paulbellamy/ratecounter"

inherit go

SRC_URI = "git://github.com/paulbellamy/ratecounter;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5a11f585a31379765c190c033b6ad39956584447"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5c6877e9ff00f661fc46f04957974004"

FILES:${PN} += "${GOBIN_FINAL}/*"
