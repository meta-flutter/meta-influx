DESCRIPTION = "github.com/onsi/ginkgo"

GO_IMPORT = "github.com/onsi/ginkgo"

inherit go

SRC_URI = "git://github.com/onsi/ginkgo;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "83438ca4278f2f56757b9ab2cb15dd4f596d84e8" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=570603114d52313cb86c0206401c9af7"

FILES:${PN} += "${GOBIN_FINAL}/*"
