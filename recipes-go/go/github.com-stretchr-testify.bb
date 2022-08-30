DESCRIPTION = "github.com/stretchr/testify"

GO_IMPORT = "github.com/stretchr/testify"

inherit go

SRC_URI = "git://github.com/stretchr/testify;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4d4bfba8f1d1027c4fdbe371823030df51419987"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=39cd1d751bc25944831de86496e3cf68"

FILES:${PN} += "${GOBIN_FINAL}/*"
