DESCRIPTION = "github.com/naoina/go-stringutil"

GO_IMPORT = "github.com/naoina/go-stringutil"

inherit go

SRC_URI = "git://github.com/naoina/go-stringutil;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6b638e95a32d0c1131db0e7fe83775cbea4a0d0b" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=fd48b703ec0214c2b9490e1db9d0d82b"

FILES_${PN} += "${GOBIN_FINAL}/*"
