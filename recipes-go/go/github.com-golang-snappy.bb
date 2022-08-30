DESCRIPTION = "github.com/golang/snappy"

GO_IMPORT = "github.com/golang/snappy"

inherit go

SRC_URI = "git://github.com/golang/snappy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "553a641470496b2327abcac10b36396bd98e45c9"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6"

FILES:${PN} += "${GOBIN_FINAL}/*"
