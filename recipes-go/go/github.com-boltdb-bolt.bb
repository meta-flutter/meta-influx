DESCRIPTION = "github.com/boltdb/bolt"

GO_IMPORT = "github.com/boltdb/bolt"

inherit go

SRC_URI = "git://github.com/boltdb/bolt;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4b1ebc1869ad66568b313d0dc410e2be72670dda"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=13b2a308eefa10d841e3bf2467dbe07a"

FILES:${PN} += "${GOBIN_FINAL}/*"
