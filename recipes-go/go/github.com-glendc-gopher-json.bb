DESCRIPTION = "github.com/glendc/gopher-json"

GO_IMPORT = "github.com/glendc/gopher-json"

inherit go

SRC_URI = "git://github.com/glendc/gopher-json;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "dc4743023d0c166c1b844da8fc688e57ec65fe0b" 
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=605b9ee741fb194674b08ff2532e52b1"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-yuin-gopher-lua \
"