DESCRIPTION = "github.com/gogo/protobuf"

GO_IMPORT = "github.com/gogo/protobuf"

inherit go

SRC_URI = "git://github.com/gogo/protobuf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a9cd0c35b97daf74d0ebf3514c5254814b2703b4"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f76ab0572aa28f537b1508f2f2bc155e"

FILES:${PN} += "${GOBIN_FINAL}/*"
