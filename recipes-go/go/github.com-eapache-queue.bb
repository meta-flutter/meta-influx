DESCRIPTION = "github.com/eapache/queue"

GO_IMPORT = "github.com/eapache/queue"

inherit go

SRC_URI = "git://github.com/eapache/queue;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "44cc805cf13205b55f69e14bcb69867d1ae92f98" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1bfd4408d3de090ef6b908b0cc45a316"

FILES:${PN} += "${GOBIN_FINAL}/*"
