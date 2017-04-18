DESCRIPTION = "github.com/prometheus/client_model"

GO_IMPORT = "github.com/prometheus/client_model"

inherit go

SRC_URI = "git://github.com/prometheus/client_model;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "fa8ad6fec33561be4280a8f0514318c79d7f6cb6" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

FILES_${PN} += "${GOBIN_FINAL}/*"
