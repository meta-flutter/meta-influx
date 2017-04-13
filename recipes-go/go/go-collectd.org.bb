DESCRIPTION = "collectd.org"

GO_IMPORT = "collectd.org"

inherit go

SRC_URI = "git://github.com/collectd/go-collectd;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "bf0e31aeedfea7fb13f821e0831cfe2b5974d1e9"
LICENSE = "DWTFYW"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=51e2bb425ba79cdbe97889a28f47eea8"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-golang-protobuf \
    google-golang.org-grpc-go \
"