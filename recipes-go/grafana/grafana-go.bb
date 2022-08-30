require grafana.inc
inherit go

DESCRIPTION = "Grafana Go Backend"
GO_IMPORT = "${REPO}"
SRC_URI = "git://${REPO};protocol=https;branch=main;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=${LIC_CHKSUM}"

FILES:${PN} += "${GOBIN_FINAL}/*"


DEPENDS+= "\
    github.com-couchbase-go-couchbase \
    github.com-kr-pty \
    github.com-lunny-nodb \
    github.com-siddontang-ledisdb \
    github.com-edsrzf-mmap-go \
    grpc-go \
"

GO_INSTALL = "\
      ${GO_IMPORT}/pkg/...  \
"
RDEPENDS:${PN}-staticdev += "\
                             bash \
                             expect \
                            "
                           
                                 