DESCRIPTION = "github.com/vjeantet/grok"

GO_IMPORT = "github.com/vjeantet/grok"

inherit go

SRC_URI = "git://github.com/vjeantet/grok;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "d73e972b60935c7fec0b4ffbc904ed39ecaf7efe" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d2794c0df5b907fdace235a619d80314"

FILES_${PN} += "${GOBIN_FINAL}/*"
