# ECHO TV Cloudflare Workers — self-host reference

ECHO TV keeps its third-party API keys out of the app by proxying those APIs through small
Cloudflare Workers. Each Worker holds its key as a server-side secret and edge-caches responses,
so a large user base costs only a handful of real upstream calls.

**What this folder is:** a complete, working, self-contained copy of each Worker so that
**anyone can run their own free copy** — no programming needed. Copy the `index.js`, paste it
into Cloudflare, add your own API key as a secret, and point ECHO TV at it.

| Folder | Worker | Secret you provide | Guide |
|---|---|---|---|
| [`tmdb/`](tmdb/) | TMDB metadata proxy (the default metadata server) | `TMDB_KEY` | [`tmdb/README.md`](tmdb/README.md) |
| [`opensub/`](opensub/) | OpenSubtitles proxy (subtitle search/download) | `OPENSUB_API_KEY` | [`opensub/README.md`](opensub/README.md) |

Each folder is a self-contained Worker: `index.js` (the whole server), `wrangler.toml` (CLI deploy
config), and a `README.md` with browser and `wrangler` deploy steps.

## Note on the public deployment

The shared OwnTV Core library's built-in default points at its maintainer's deployment. That
deployment runs this same proxy logic plus additional abuse-protection (request budgets and client checks) which is
deliberately **not** published — publishing it would only help someone work around it. None of
that is needed for a personal copy: your own Worker serves only your own devices, and Cloudflare's
free plan is far more capacity than one household can use.

If you self-host for ECHO TV, you get the full feature set. The only thing you don't get is a
copy of the shared service's rate limiting, which a personal Worker does not need.
