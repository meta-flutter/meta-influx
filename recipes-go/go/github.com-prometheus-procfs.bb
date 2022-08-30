DESCRIPTION = "github.com/prometheus/procfs"

GO_IMPORT = "github.com/prometheus/procfs"

inherit go

SRC_URI = "git://github.com/prometheus/procfs;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "1e2146578273cef808354faa16a1922e0b5d6b2f" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

FILES:${PN} += "${GOBIN_FINAL}/*"
