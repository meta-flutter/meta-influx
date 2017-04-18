DESCRIPTION = "github.com/influxdata/wlog"

GO_IMPORT = "github.com/influxdata/wlog"

inherit go

SRC_URI = "git://github.com/influxdata/wlog;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "7c63b0a71ef8300adc255344d275e10e5c3a71ec" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6fff484b68651576c5d61eb26c51b043"

FILES_${PN} += "${GOBIN_FINAL}/*"
