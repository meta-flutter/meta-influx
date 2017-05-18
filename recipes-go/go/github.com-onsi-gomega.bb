DESCRIPTION = "github.com/onsi/gomega"

GO_IMPORT = "github.com/onsi/gomega"

inherit go

SRC_URI = "git://github.com/onsi/gomega;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "da367351331c75190afec7ed3a0c61e0016942ed" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=570603114d52313cb86c0206401c9af7"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
            gopkg.in-yaml.v2 \
            github.com-golang-protobuf \
"