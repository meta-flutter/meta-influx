DESCRIPTION = "github.com/rakyll/statik"

GO_IMPORT = "github.com/rakyll/statik"

inherit go

SRC_URI = "git://github.com/rakyll/statik;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"

SRCREV = "e383bbf6b2ec1a2fb8492dfd152d945fb88919b6"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a873c5645c184d51e0f9b34e1d7cf559"

GO_INSTALL = "\
    ${GO_IMPORT} \
    "

FILES_${PN} += "${GOBIN_FINAL}/*"
