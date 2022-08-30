DESCRIPTION = "github.com/couchbase/clog"

GO_IMPORT = "github.com/couchbase/clog"

inherit go

SRC_URI = "git://github.com/couchbase/clog;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "9df440603f505d471a0bb3fa245c3b3701e1a8ed" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

FILES:${PN} += "${GOBIN_FINAL}/*"
