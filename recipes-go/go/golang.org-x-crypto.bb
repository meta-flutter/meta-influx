DESCRIPTION = "golang.org/x/crypto"

GO_IMPORT = "golang.org/x/crypto"

inherit go

SRC_URI = "git://github.com/golang/crypto;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "9477e0b78b9ac3d0b03822fd95422e2fe07627cd"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707"

FILES_${PN} += "${GOBIN_FINAL}/*"
