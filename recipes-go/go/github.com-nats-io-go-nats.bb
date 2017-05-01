DESCRIPTION = "github.com/nats-io/go-nats"

GO_IMPORT = "github.com/nats-io/go-nats"

inherit go

SRC_URI = "git://github.com/nats-io/go-nats;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6949c8e06a246e4177961aab22940b5c411e48f0" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f0add7a94e4dd1aa93a5a58b7ddada08"

FILES_${PN} += "${GOBIN_FINAL}/*"


DEPENDS+="\
    github.com-nats-io-nuid \
    github.com-nats-io-gnatsd \
"

RDEPENDS_${PN}-staticdev += "\
                             bash \
                             "