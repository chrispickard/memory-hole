(ns memory-hole.subscriptions
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  :db-state
  (fn [db _]
    db))

(reg-sub
  :active-page
  (fn [db _]
    (:active-page db)))

(reg-sub
  :loading?
  (fn [db _]
    (:loading? db)))

(reg-sub
  :user
  (fn [db _]
    (:user db)))

(reg-sub
  :tags
  (fn [db _]
    (:tags db)))

(reg-sub
  :selected-tag
  (fn [db _]
    (:selected-tag db)))

(reg-sub
  :issue
  (fn [db _]
    (:issue db)))

(reg-sub
  :issues
  (fn [db _]
    (:issues db)))

(reg-sub
  :error
  (fn [db _]
    (:error db)))

(reg-sub
  :login-events
  (fn [db _]
    (:login-events db)))

;;admin
(reg-sub
  :admin/users
  (fn [db _]
    (:admin/users db)))

