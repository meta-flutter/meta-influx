DESCRIPTION = "github.com/retailnext/hllpp"

GO_IMPORT = "github.com/retailnext/hllpp"

inherit go

SRC_URI = "git://github.com/retailnext/hllpp;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "38a7bb71b483e855d35010808143beaf05b67f9d"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6ead99ca4439fb5aef1bfe9799cb02e7"

FILES:${PN} += "${GOBIN_FINAL}/*"
