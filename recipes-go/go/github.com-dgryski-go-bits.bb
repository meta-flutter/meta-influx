DESCRIPTION = "github.com/dgryski/go-bits"

GO_IMPORT = "github.com/dgryski/go-bits"

inherit go

SRC_URI = "git://github.com/dgryski/go-bits;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "2ad8d707cc05b1815ce6ff2543bb5e8d8f9298ef"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=94d87602d16546d50e0b7e0930c3dae5"

FILES_${PN} += "${GOBIN_FINAL}/*"
