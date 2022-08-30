DESCRIPTION = "github.com/nats-io/gnatsd"

GO_IMPORT = "github.com/nats-io/gnatsd"

inherit go

SRC_URI = "git://github.com/nats-io/gnatsd;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "e35c4204fc1a9ac0e51b0333f6ece4227afb38ee" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f0add7a94e4dd1aa93a5a58b7ddada08"

FILES:${PN} += "${GOBIN_FINAL}/*"

RDEPENDS:${PN}-staticdev += "\
                                bash \
                             "