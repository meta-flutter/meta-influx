DESCRIPTION = "github.com/prometheus/procfs"

GO_IMPORT = "github.com/prometheus/procfs"

inherit go

SRC_URI = "git://github.com/prometheus/procfs;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "1878d9fbb537119d24b21ca07effd591627cd160" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

FILES_${PN} += "${GOBIN_FINAL}/*"
