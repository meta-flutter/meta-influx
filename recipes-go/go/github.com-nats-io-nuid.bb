DESCRIPTION = "github.com/nats-io/nuid"

GO_IMPORT = "github.com/nats-io/nuid"

inherit go

SRC_URI = "git://github.com/nats-io/nuid;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "289cccf02c178dc782430d534e3c1f5b72af807f" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=dd60e660325dce3d61c11cd88796cd51"

FILES:${PN} += "${GOBIN_FINAL}/*"
