DESCRIPTION = "github.com/Pallinder/go-randomdata"

GO_IMPORT = "github.com/Pallinder/go-randomdata"

inherit go

SRC_URI = "git://github.com/Pallinder/go-randomdata;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "8c3362a5e6781e0d1046f1267b3c1f19b2cde334" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=660e874b2042f0cf805785403a0a04e9"

FILES:${PN} += "${GOBIN_FINAL}/*"
