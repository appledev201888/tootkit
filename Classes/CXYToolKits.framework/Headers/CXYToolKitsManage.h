
#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface CXYToolKitsManage : NSObject

+ (CXYToolKitsManage *)sharedManager;

- (void)CXYToolKitsbegin:(UIView *)view;

- (void)CXYToolKitsend:(UIView *)view;

@end

NS_ASSUME_NONNULL_END
