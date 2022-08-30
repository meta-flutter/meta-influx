DESCRIPTION = "github.com/clarkduvall/hyperloglog"

GO_IMPORT = "github.com/clarkduvall/hyperloglog"

inherit go

SRC_URI = "git://github.com/clarkduvall/hyperloglog;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "2d38f733946d0a1f2e810513c71b834cbeba1480"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=56b47d379805ed45bc0c1aff19d7364b"

FILES:${PN} += "${GOBIN_FINAL}/*"
