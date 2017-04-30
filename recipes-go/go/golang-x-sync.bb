DESCRIPTION = "golang.org/x/sync"

GO_IMPORT = "golang.org/x/sync"

inherit go

SRC_URI = "git://github.com/golang/sync;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5a06fca2c336a4b2b2fcb45702e8c47621b2aa2c"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    golang.org-x-net \
"