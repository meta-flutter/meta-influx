DESCRIPTION = "github.com/jwilder/encoding"

GO_IMPORT = "github.com/jwilder/encoding"

inherit go

SRC_URI = "git://github.com/jwilder/encoding;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "27894731927e49b0a9023f00312be26733744815"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e75d4fbdba08ce3a518e7aab13042096"

FILES:${PN} += "${GOBIN_FINAL}/*"
