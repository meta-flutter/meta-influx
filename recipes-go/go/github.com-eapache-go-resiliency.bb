DESCRIPTION = "github.com/eapache/go-resiliency"

GO_IMPORT = "github.com/eapache/go-resiliency"

inherit go

SRC_URI = "git://github.com/eapache/go-resiliency;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b86b1ec0dd4209a588dc1285cdd471e73525c0b3" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b5d5c42dfd88384315d2340222c139ab"

FILES_${PN} += "${GOBIN_FINAL}/*"
