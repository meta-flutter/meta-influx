DESCRIPTION = "github.com/wvanbergen/kafka"

GO_IMPORT = "github.com/wvanbergen/kafka"

inherit go

SRC_URI = "git://github.com/wvanbergen/kafka;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "bc265fedb9ff5b5c5d3c0fdcef4a819b3523d3ee" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ec355810d8dea8f1fbc32d149f397ceb"

FILES:${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-shopify-sarama \
    github.com-wvanbergen-kazoo-go\
"