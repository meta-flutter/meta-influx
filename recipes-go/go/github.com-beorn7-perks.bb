DESCRIPTION = "github.com/beorn7/perks"

GO_IMPORT = "github.com/beorn7/perks"

inherit go

SRC_URI = "git://github.com/beorn7/perks;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4c0e84591b9aa9e6dcfdf3e020114cd81f89d5f9" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0d0738f37ee8dc0b5f88a32e83c60198"

FILES:${PN} += "${GOBIN_FINAL}/*"
