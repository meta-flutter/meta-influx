DESCRIPTION = "github.com/googleapis/gax-go"

GO_IMPORT = "github.com/googleapis/gax-go"

inherit go

SRC_URI = "git://github.com/googleapis/gax-go.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "9af46dd5a1713e8b5cd71106287eba3cefdde50b" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0dd48ae8103725bd7b401261520cdfbb"

FILES_${PN} += "${GOBIN_FINAL}/*"

