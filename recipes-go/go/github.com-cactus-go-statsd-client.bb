DESCRIPTION = "github.com/cactus/go-statsd-client"

GO_IMPORT = "github.com/cactus/go-statsd-client"

inherit go

SRC_URI = "git://github.com/cactus/go-statsd-client;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "d8eabe07bc70ff9ba6a56836cde99d1ea3d005f7" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=777c3f326093fa1917927de63bfe8cc1"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    github.com-jessevdk-go-flags\
"