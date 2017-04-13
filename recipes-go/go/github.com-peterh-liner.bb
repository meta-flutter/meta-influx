DESCRIPTION = "github.com/peterh/liner"

GO_IMPORT = "github.com/peterh/liner"

inherit go

SRC_URI = "git://github.com/peterh/liner;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "88609521dc4b6c858fd4c98b628147da928ce4ac"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/COPYING;md5=7316a33df6826d7cc2854e686cb9279f"

FILES_${PN} += "${GOBIN_FINAL}/*"
