DESCRIPTION = "github.com/pierrec/lz4"

GO_IMPORT = "github.com/pierrec/lz4"

inherit go

SRC_URI = "git://github.com/pierrec/lz4;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5c9560bfa9ace2bf86080bf40d46b34ae44604df" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-pierrec-xxhash \
"