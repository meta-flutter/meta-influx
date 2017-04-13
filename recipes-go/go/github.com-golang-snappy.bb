DESCRIPTION = "github.com/golang/snappy"

GO_IMPORT = "github.com/golang/snappy"

inherit go

SRC_URI = "git://github.com/golang/snappy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b8b79c7d4cda128290b98c6a21f9aac6"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f76ab0572aa28f537b1508f2f2bc155e"

FILES_${PN} += "${GOBIN_FINAL}/*"
