DESCRIPTION = "github.com/pierrec/xxHash"

GO_IMPORT = "github.com/pierrec/xxHash"

inherit go

SRC_URI = "git://github.com/pierrec/xxHash;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5a004441f897722c627870a981d02b29924215fa" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=56d10a0d06f21b0b8a2181e417369064"

FILES:${PN} += "${GOBIN_FINAL}/*"
