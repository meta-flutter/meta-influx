DESCRIPTION = "github.com/dgryski/go-bitstream"

GO_IMPORT = "github.com/dgryski/go-bitstream"

inherit go

SRC_URI = "git://github.com/dgryski/go-bitstream;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "7d46cd22db7004f0cceb6f7975824b560cf0e486"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=94d87602d16546d50e0b7e0930c3dae5"

FILES_${PN} += "${GOBIN_FINAL}/*"
